/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.streams

import io.vertx.core.streams.Pipe
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Start to pipe the elements to the destination <code>WriteStream</code>.
 * <p>
 * When the operation fails with a write error, the source stream is resumed.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.Pipe original] using Vert.x codegen.
 */
suspend fun <T> Pipe<T>.toAwait(dst : WriteStream<T>) : Unit {
  return awaitResult{
    this.to(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

