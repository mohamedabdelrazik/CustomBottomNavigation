package henry.co.bottom.navigtion

import java.io.Serializable

class SpaceItem : Serializable {

    var id = -1

    internal var itemName: String? = null

    internal var itemActiveIcon: Int = 0
    internal var itemUnActiveIcon: Int = 0
    internal var isSelected: Boolean = false

    constructor(itemName: String, itemActiveIcon: Int, itemUnActiveIcon: Int, isSelected: Boolean) {
        this.itemName = itemName
        this.itemActiveIcon = itemActiveIcon
        this.itemUnActiveIcon = itemUnActiveIcon
        this.isSelected = isSelected
    }

    constructor(id: Int, itemIcon: Int) {
        this.id = id
        this.itemActiveIcon = itemIcon
    }

    constructor(
        id: Int,
        itemName: String,
        itemIcon: Int,
        itemUnActiveIcon: Int,
        isSelected: Boolean
    ) : this(itemName, itemIcon, itemUnActiveIcon, isSelected) {
        this.id = id
    }
}
