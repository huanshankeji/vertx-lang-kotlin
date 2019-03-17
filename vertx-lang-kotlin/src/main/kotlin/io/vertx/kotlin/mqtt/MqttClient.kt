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
package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttClient
import io.vertx.mqtt.messages.MqttConnAckMessage

/**
 * Connects to an MQTT server calling connectHandler after connection
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port : Int, host : String) : MqttConnAckMessage {
  return awaitResult{
    this.connect(port, host, it)
  }
}

/**
 * Connects to an MQTT server calling connectHandler after connection
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @param serverName the SNI server name
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port : Int, host : String, serverName : String) : MqttConnAckMessage {
  return awaitResult{
    this.connect(port, host, serverName, it)
  }
}

/**
 * Disconnects from the MQTT server calling disconnectHandler after disconnection
 *
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.disconnectAwait() : Unit {
  return awaitResult{
    this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Sends the PUBLISH message to the remote MQTT server
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.publishAwait(topic : String, payload : Buffer, qosLevel : MqttQoS, isDup : Boolean, isRetain : Boolean) : Int {
  return awaitResult{
    this.publish(topic, payload, qosLevel, isDup, isRetain, it)
  }
}

/**
 * Subscribes to the topic with a specified QoS level
 *
 * @param topic topic you subscribe on
 * @param qos QoS level
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topic : String, qos : Int) : Int {
  return awaitResult{
    this.subscribe(topic, qos, it)
  }
}

/**
 * Subscribes to the topic and adds a handler which will be called after the request is sent
 *
 * @param topics topics you subscribe on
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topics : Map<String,Int>) : Int {
  return awaitResult{
    this.subscribe(topics, it)
  }
}

/**
 * Unsubscribe from receiving messages on given topic
 *
 * @param topic Topic you want to unsubscribe from
 * @return current MQTT client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttClient original] using Vert.x codegen.
 */
suspend fun MqttClient.unsubscribeAwait(topic : String) : Int {
  return awaitResult{
    this.unsubscribe(topic, it)
  }
}

