package com.github.spanierm.archunitjunit5kotlin.hexagonal.domain.model

import com.github.spanierm.archunitjunit5kotlin.hexagonal.domain.service.DomainService

class DomainModel {
    val forbiddenDomainServiceAccess = DomainService()
}
