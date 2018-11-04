package com.github.spanierm.archunitjunit5kotlin.onion.adapter.rest

import com.github.spanierm.archunitjunit5kotlin.onion.adapter.cli.AdapterCli
import com.github.spanierm.archunitjunit5kotlin.onion.adapter.persistence.AdapterPersistence

class AdapterRest {
    val forbiddenOtherAdapterAccess = AdapterPersistence()
    val forbiddenTransitivePackageCycle = AdapterCli()
}
