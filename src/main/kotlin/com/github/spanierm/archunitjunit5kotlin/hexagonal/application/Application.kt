package com.github.spanierm.archunitjunit5kotlin.hexagonal.application

import com.github.spanierm.archunitjunit5kotlin.hexagonal.adapter.persistence.AdapterPersistence

class Application {
    val forbiddenAdapterAccess = AdapterPersistence()
}
