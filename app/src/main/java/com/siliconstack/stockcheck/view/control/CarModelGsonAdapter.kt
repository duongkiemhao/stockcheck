package com.siliconstack.stockcheck.view.control

import com.google.gson.*
import com.siliconstack.stockcheck.model.CarModel
import java.lang.reflect.Type

class CarModelGsonAdapter: JsonDeserializer<CarModel> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): CarModel {
        val originalJsonObject = json!!.asJsonObject
        val replacementJsonObject = JsonObject()
        for (elementEntry in originalJsonObject.entrySet()) {
            var key = elementEntry.key
            val value = originalJsonObject.get(key)
            key = key.toLowerCase()
            replacementJsonObject.add(key, value)
        }
        return Gson().fromJson(replacementJsonObject, CarModel::class.java)
    }

}