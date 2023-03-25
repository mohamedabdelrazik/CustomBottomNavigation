package henry.co.bottom.navigtion

import java.io.Serializable

class SpaceItem : Serializable {

    var id = -1

    internal var itemName: String? = null

    internal var itemIcon: Int = 0
    internal var isSelected: Boolean = false

    constructor(itemName: String, itemIcon: Int,isSelected : Boolean) {
        this.itemName = itemName
        this.itemIcon = itemIcon
        this.isSelected = isSelected
    }

    constructor(id: Int, itemIcon: Int) {
        this.id = id
        this.itemIcon = itemIcon
    }

    constructor(id: Int, itemName: String, itemIcon: Int,isSelected : Boolean) : this(itemName, itemIcon,isSelected) {
        this.id = id
    }
}
