package com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.rest

import com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.cli.AdapterCli
import com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.persistence.AdapterPersistence

class AdapterRest {
    val forbiddenOtherAdapterAccess = AdapterPersistence()
    val forbiddenTransitivePackageCycle = AdapterCli()
}
