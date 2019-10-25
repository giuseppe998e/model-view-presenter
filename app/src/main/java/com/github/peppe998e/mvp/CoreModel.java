package com.github.peppe998e.mvp;

import com.github.peppe998e.mvp.utils.CallBack;

/**
 * Interface of CoreModel in order to hide methods and grow modularity
 *
 */
public interface CoreModel {
    void testString(CallBack<String> cb);
}
