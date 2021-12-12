package com.example.sebackend.nettyClient;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import org.apache.tomcat.jni.Time;

import static org.apache.tomcat.jni.Time.sleep;

@Sharable
public class NettyClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		//ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Netty", CharsetUtil.UTF_8));
		ctx.writeAndFlush(Unpooled.copiedBuffer("UpdateInformation", CharsetUtil.UTF_8));
		while (true){
			ctx.writeAndFlush(Unpooled.copiedBuffer("UpdateInformation", CharsetUtil.UTF_8));
			Time.sleep(1000);
			System.out.println("发送请求");
		}
	}

	@Override
	public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {
		System.out.println("客户端接收到数据:" + in.toString(CharsetUtil.UTF_8));
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}
}