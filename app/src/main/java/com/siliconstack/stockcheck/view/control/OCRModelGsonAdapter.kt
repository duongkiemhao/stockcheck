package com.siliconstack.stockcheck.view.control

import com.google.gson.*
import com.siliconstack.stockcheck.model.OCRModel
import java.lang.reflect.Type

class OCRModelGsonAdapter: JsonDeserializer<OCRModel> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): OCRModel {
        val originalJsonObject = json!!.asJsonObject
        val replacementJsonObject = JsonObject()
        for (elementEntry in originalJsonObject.entrySet()) {
            var key = elementEntry.key
            val value = originalJsonObject.get(key)
            key = key.toLowerCase()
            replacementJsonObject.add(key, value)
        }
        return Gson().fromJson(replacementJsonObject, OCRModel::class.java)
    }

}