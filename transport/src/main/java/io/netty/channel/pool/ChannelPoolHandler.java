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
package io.netty.channel.pool;

import io.netty.channel.Channel;
import io.netty.channel.EventLoop;
import io.netty.util.concurrent.Promise;

/**
 * Handler which is called for various actions done by the {@link ChannelPool}.处理程序，用于调用ChannelPool执行的各种操作。
 */
public interface ChannelPoolHandler {
    /**
     * Called once a {@link Channel} was released by calling {@link ChannelPool#release(Channel)} or
     * {@link ChannelPool#release(Channel, Promise)}.通过调用ChannelPool.release(Channel)或ChannelPool来调用一个通道。版本(渠道,承诺)。该方法将由通道的EventLoop调用。
     *
     * This method will be called by the {@link EventLoop} of the {@link Channel}.
     */
    void channelReleased(Channel ch) throws Exception;

    /**
     * Called once a {@link Channel} was acquired by calling {@link ChannelPool#acquire()} or
     * {@link ChannelPool#acquire(Promise)}.
     *
     * This method will be called by the {@link EventLoop} of the {@link Channel}.
     * 一旦通过调用ChannelPool.acquire()或channelpool . acquisition (Promise)获得了一个信道。该方法将由通道的EventLoop调用。
     */
    void channelAcquired(Channel ch) throws Exception;

    /**
     * Called once a new {@link Channel} is created in the {@link ChannelPool}.在ChannelPool中创建一个新通道时调用。该方法将由通道的EventLoop调用。
     *
     * This method will be called by the {@link EventLoop} of the {@link Channel}.
     */
    void channelCreated(Channel ch) throws Exception;
}
