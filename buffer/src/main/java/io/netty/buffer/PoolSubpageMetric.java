/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.buffer;

/**
 * Metrics for a sub-page.度量大。
 */
public interface PoolSubpageMetric {

    /**
     * Return the number of maximal elements that can be allocated out of the sub-page.返回可以从子页面中分配的最大元素的数量。
     */
    int maxNumElements();

    /**
     * Return the number of available elements to be allocated.返回要分配的可用元素的数量。
     */
    int numAvailable();

    /**
     * Return the size (in bytes) of the elements that will be allocated.返回将要分配的元素的大小(以字节为单位)。
     */
    int elementSize();

    /**
     * Return the size (in bytes) of this page.返回页面的大小(以字节为单位)。
     */
    int pageSize();
}

