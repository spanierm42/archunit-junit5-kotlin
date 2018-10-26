package com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.persistence

import com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.rest.AdapterRest

class AdapterPersistence {
    val forbiddenDirectPackageCycleWithAdapterRest = AdapterRest()
    val forbiddenTransitivePackageCycle = AdapterRest()
}
