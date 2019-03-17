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
package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.BridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.BridgeOptions] objects.
 *
 * Specify the event bus bridge options.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 * @param pointToPoint 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.BridgeOptions original] using Vert.x codegen.
 */
fun bridgeOptionsOf(
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  pointToPoint: Boolean? = null): BridgeOptions = io.vertx.ext.stomp.BridgeOptions().apply {

  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (pointToPoint != null) {
    this.setPointToPoint(pointToPoint)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.BridgeOptions] objects.
 *
 * Specify the event bus bridge options.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 * @param pointToPoint 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.BridgeOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bridgeOptionsOf(inboundPermitteds, outboundPermitteds, pointToPoint)")
)
fun BridgeOptions(
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  pointToPoint: Boolean? = null): BridgeOptions = io.vertx.ext.stomp.BridgeOptions().apply {

  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (pointToPoint != null) {
    this.setPointToPoint(pointToPoint)
  }
}

