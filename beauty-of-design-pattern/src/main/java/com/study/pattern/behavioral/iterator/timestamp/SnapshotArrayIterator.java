package com.study.pattern.behavioral.iterator.timestamp;

import java.util.Iterator;

public class SnapshotArrayIterator<E> implements Iterator<E> {
    private long snapshotTimestamp;
    private int cursorInAll;
    private int leftCount;
    private ArrayList<E> arrayList;

    public SnapshotArrayIterator(ArrayList<E> arrayList) {
        this.snapshotTimestamp = System.currentTimeMillis();
        this.cursorInAll = 0;
        this.leftCount = arrayList.actualSize();
        this.arrayList = arrayList;
        justNext();
    }

    @Override
    public boolean hasNext() {
        return this.leftCount >= 0;
    }

    @Override
    public E next() {
        E currentItem = arrayList.get(cursorInAll);
        justNext();
        return currentItem;
    }

    private void justNext() {
        while (cursorInAll < arrayList.totalSize()) {
            long addTimestamp = arrayList.getAddTimestamp(cursorInAll);
            long delTimestamp = arrayList.getDelTimestamp(cursorInAll);
            if (snapshotTimestamp > addTimestamp && snapshotTimestamp < delTimestamp) {
                leftCount --;
                break;
            }
            cursorInAll++;
        }
    }
}
