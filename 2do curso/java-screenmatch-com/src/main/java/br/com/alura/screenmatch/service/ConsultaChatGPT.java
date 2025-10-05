package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("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"));


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("GPT-5-Mini")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
