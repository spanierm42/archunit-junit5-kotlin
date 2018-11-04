package com.github.spanierm.archunitjunit5kotlin.onion.adapter.persistence

import com.github.spanierm.archunitjunit5kotlin.onion.adapter.rest.AdapterRest

class AdapterPersistence {
    val forbiddenDirectPackageCycleWithAdapterRest = AdapterRest()
    val forbiddenTransitivePackageCycle = AdapterRest()
}
