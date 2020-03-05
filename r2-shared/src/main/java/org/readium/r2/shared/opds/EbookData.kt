package org.readium.r2.shared.opds

import org.readium.r2.shared.Publication

/*
 * Singleton used to pass the publication between activities.
 * Reason for this is due to crashing on larger books:
 * https://rbdigital.atlassian.net/browse/RBPDMOBILE-2403
 */
object EbookData {

    var publication: Publication? = null

}