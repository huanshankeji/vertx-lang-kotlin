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
package io.vertx.kotlin.ext.auth.oauth2.providers

import io.vertx.core.Vertx
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth as OpenIDConnectAuthVertxAlias
import io.vertx.kotlin.coroutines.awaitResult

object OpenIDConnectAuth {
/**
 * Create a OAuth2Auth provider for OpenID Connect Discovery. The discovery will use the given site in the
 * configuration options and attempt to load the well known descriptor.
 *
 * If the discovered config includes a json web key url, it will be also fetched and the JWKs will be loaded
 * into the OAuth provider so tokens can be decoded.
 *
 * @param vertx the vertx instance
 * @param config the initial config, it should contain a site url
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth original] using Vert.x codegen.
 */
  suspend fun discoverAwait(vertx : Vertx, config : OAuth2ClientOptions) : OAuth2Auth {
    return awaitResult{
      OpenIDConnectAuthVertxAlias.discover(vertx, config, it)
    }
  }

}
