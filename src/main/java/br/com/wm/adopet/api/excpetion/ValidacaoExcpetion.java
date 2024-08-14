package br.com.wm.adopet.api.excpetion;

public class ValidacaoExcpetion extends RuntimeException {
    public ValidacaoExcpetion(String message) {
        super(message);
    }
}
