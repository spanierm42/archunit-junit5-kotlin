package com.github.spanierm.archunitjunit5kotlin.onion.domain.model

import com.github.spanierm.archunitjunit5kotlin.onion.domain.service.DomainService

class DomainModel {
    val forbiddenDomainServiceAccess = DomainService()
}
