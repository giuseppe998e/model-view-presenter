package com.github.peppe998e.mvp.utils;

/**
 * This interface is used to allow the Model to pass back the information
 * updating the views without using a "return"
 *
 * @param <T>
 */
@FunctionalInterface
public interface CallBack<T> {
    void exec(T value);
}
