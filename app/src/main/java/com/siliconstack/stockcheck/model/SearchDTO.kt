package com.siliconstack.stockcheck.model

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class SearchDTO(title: String, items: List<MainDTO>) : ExpandableGroup<MainDTO>(title, items)