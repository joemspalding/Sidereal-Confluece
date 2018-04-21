package PlayerInfo

import Items.ITradeable

class TradeBucket  {
    private var bucket = mutableListOf<ITradeable>()

    fun addToBucket (item: ITradeable) {
        bucket.add(item)
        System.out.println("Added $item to the bucket.")
    }

}