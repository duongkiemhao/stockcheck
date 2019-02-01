package com.siliconstack.stockcheck.model

import com.google.gson.annotations.SerializedName

data class GoogleVisionResponse(
        @SerializedName("responses")
        var responses: List<Response?>?
) {
    data class Response(
            @SerializedName("cropHintsAnnotation")
            var cropHintsAnnotation: CropHintsAnnotation?,
            @SerializedName("imagePropertiesAnnotation")
            var imagePropertiesAnnotation: ImagePropertiesAnnotation?,
            @SerializedName("webDetection")
            var webDetection: WebDetection?
    ) {
        data class CropHintsAnnotation(
                @SerializedName("cropHints")
                var cropHints: List<CropHint?>?
        ) {
            data class CropHint(
//                    @SerializedName("boundingPoly")
                    var boundingPoly: BoundingPoly?,
//                    @SerializedName("confidence")
                    var confidence: Double?,
//                    @SerializedName("importanceFraction")
                    var importanceFraction: Double?
            ) {
                data class BoundingPoly(
                        @SerializedName("vertices")
                        var vertices: List<Vertice?>?
                ) {
                    data class Vertice(
                            @SerializedName("x")
                            var x: Int?,
                            @SerializedName("y")
                            var y: Int?
                    )
                }
            }
        }

        data class ImagePropertiesAnnotation(
                @SerializedName("dominantColors")
                var dominantColors: DominantColors?
        ) {
            data class DominantColors(
                    @SerializedName("colors")
                    var colors: List<Color?>?
            ) {
                data class Color(
                        @SerializedName("color")
                        var color: Color?,
                        @SerializedName("pixelFraction")
                        var pixelFraction: Double?,
                        @SerializedName("score")
                        var score: Double?
                ) {
                    data class Color(
                            @SerializedName("blue")
                            var blue: Int?,
                            @SerializedName("green")
                            var green: Int?,
                            @SerializedName("red")
                            var red: Int?
                    )
                }
            }
        }

        data class WebDetection(
                @SerializedName("bestGuessLabels")
                var bestGuessLabels: List<BestGuessLabel?>?,
                @SerializedName("fullMatchingImages")
                var fullMatchingImages: List<FullMatchingImage?>?,

                @SerializedName("pagesWithMatchingImages")
                var pagesWithMatchingImages: List<PagesWithMatchingImage?>?,
                @SerializedName("partialMatchingImages")
                var partialMatchingImages: List<PartialMatchingImage?>?,
                @SerializedName("visuallySimilarImages")
                var visuallySimilarImages: List<VisuallySimilarImage?>?,
                @SerializedName("webEntities")
                var webEntities: List<WebEntity?>?
        ) {
            data class FullMatchingImage(
                    @SerializedName("url")
                    var url: String?
            )

            data class VisuallySimilarImage(
                    @SerializedName("url")
                    var url: String?
            )

            data class PagesWithMatchingImage(
                    @SerializedName("fullMatchingImages")
                    var fullMatchingImages: List<FullMatchingImage?>?,
                    @SerializedName("pageTitle")
                    var pageTitle: String?,
                    @SerializedName("partialMatchingImages")
                    var partialMatchingImages: List<PartialMatchingImage?>?,
                    @SerializedName("url")
                    var url: String?
            ) {
                data class FullMatchingImage(
                        @SerializedName("url")
                        var url: String?
                )

                data class PartialMatchingImage(
                        @SerializedName("url")
                        var url: String?
                )
            }

            data class PartialMatchingImage(
                    @SerializedName("url")
                    var url: String?
            )

            data class BestGuessLabel(
                    @SerializedName("label")
                    var label: String?,
                    @SerializedName("languageCode")
                    var languageCode: String?
            )

            data class WebEntity(
                    @SerializedName("description")
                    var description: String?,
                    @SerializedName("entityId")
                    var entityId: String?,
                    @SerializedName("score")
                    var score: Double?
            )
        }
    }
}