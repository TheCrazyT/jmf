/*
 * @(#)JmpxAckNotifyEvent.java	1.2 02/08/21
 *
 * Copyright (c) 1996-2002 Sun Microsystems, Inc.  All rights reserved.
 */

package com.sun.media.codec.video.jmpx;

/**
 * An event generated by mpx.
 */
public class JmpxAckNotifyEvent extends JmpxEvent {

    int	sequence;

    public int getSequence() {
	return sequence;
    }
}

