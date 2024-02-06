package com.example.geminai

/**
 * A sealed hierarchy describing the state of the text generation.
 */
sealed interface ContentGeneratorUiState {

    /**
     * Empty state when the screen is first shown
     */
    object Initial : ContentGeneratorUiState

    /**
     * Still loading
     */
    object Loading : ContentGeneratorUiState

    /**
     * Text has been generated
     */
    data class Success(
            val outputText: String
    ) : ContentGeneratorUiState

    /**
     * There was an error generating text
     */
    data class Error(
            val errorMessage: String
    ) : ContentGeneratorUiState
}