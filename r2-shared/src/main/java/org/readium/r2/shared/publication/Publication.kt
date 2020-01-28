/*
 * Module: r2-shared-kotlin
 * Developers: Aferdita Muriqi, Clément Baumann, Mickaël Menu
 *
 * Copyright (c) 2020. Readium Foundation. All rights reserved.
 * Use of this source code is governed by a BSD-style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package org.readium.r2.shared.publication

import org.readium.r2.shared.publication.webpub.WebPublication
import org.readium.r2.shared.publication.webpub.WebPublicationInterface

class Publication(private val webpub: WebPublication) : WebPublicationInterface by webpub {

}