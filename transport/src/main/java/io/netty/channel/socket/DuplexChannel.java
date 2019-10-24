/*
 * Copyright 2016 The Netty Project
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
package io.netty.channel.socket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;

import java.net.Socket;

/**
 * A duplex {@link Channel} that has two sides that can be shutdown independently.一种双工信道，具有可独立关闭的两侧。
 */
public interface DuplexChannel extends Channel {
    /**
     * Returns {@code true} if and only if the remote peer shut down its output so that no more
     * data is received from this channel.  Note that the semantic of this method is different from
     * that of {@link Socket#shutdownInput()} and {@link Socket#isInputShutdown()}.
     * 当且仅当远程对等点关闭其输出以使不再从该通道接收更多数据时返回true。注意，此方法的语义不同于Socket.shutdownInput()和Socket.isInputShutdown()。
     */
    boolean isInputShutdown();

    /**
     * @see Socket#shutdownInput()
     */
    ChannelFuture shutdownInput();

    /**
     * Will shutdown the input and notify {@link ChannelPromise}.将关闭输入并通知ChannelPromise。
     *
     * @see Socket#shutdownInput()
     */
    ChannelFuture shutdownInput(ChannelPromise promise);

    /**
     * @see Socket#isOutputShutdown()
     */
    boolean isOutputShutdown();

    /**
     * @see Socket#shutdownOutput()
     */
    ChannelFuture shutdownOutput();

    /**
     * Will shutdown the output and notify {@link ChannelPromise}.将关闭输出并通知ChannelPromise。
     *
     * @see Socket#shutdownOutput()
     */
    ChannelFuture shutdownOutput(ChannelPromise promise);

    /**
     * Determine if both the input and output of this channel have been shutdown.确定该通道的输入和输出是否已经关闭。
     */
    boolean isShutdown();

    /**
     * Will shutdown the input and output sides of this channel.将关闭该通道的输入和输出端。
     * @return will be completed when both shutdown operations complete.
     */
    ChannelFuture shutdown();

    /**
     * Will shutdown the input and output sides of this channel.将关闭该通道的输入和输出端。
     * @param promise will be completed when both shutdown operations complete.
     * @return will be completed when both shutdown operations complete.
     */
    ChannelFuture shutdown(ChannelPromise promise);
}
