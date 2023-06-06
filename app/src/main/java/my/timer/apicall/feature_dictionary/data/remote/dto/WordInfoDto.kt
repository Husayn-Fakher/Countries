package my.timer.apicall.feature_dictionary.data.remote.dto

import my.timer.apicall.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfo {
        return WordInfo(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            word = word
        )
    }
}