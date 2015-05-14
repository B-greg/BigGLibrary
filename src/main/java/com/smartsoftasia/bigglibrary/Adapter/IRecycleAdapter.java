package com.smartsoftasia.bigglibrary.Adapter;

import java.util.Collection;
import java.util.List;

/**
 * Created by gregoire on 11/11/14.
 */
public interface IRecycleAdapter<T> {

    /**
     * Get item at position
     *
     * @param position position on the list
     * @return items at the position
     */
    public Object getItem(int position);
    /**
     * Get all items
     *
     * @return all items
     */
    public List<T> getItems();

    /**
     * Add new items to le current list
     *
     * @param items New items.
     */
    public void appendItems(Collection<T> items);

    /**
     * Add mew item
     *
     * @param item mew item
     */
    public void appendItem(T item);

    /**
     * append items and clean old list
     *
     * @param items new items
     */
    public void appendNewsItems(Collection<T> items);

    /**
     * Clean the item list
     */
    public void clear();

}
