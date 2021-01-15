package com.example.personaldiary.utils;

public enum Messages {
    Delete("Deletado com sucesso."),
    Update("Alterado com sucesso"),
    Save("Adicionado com sucesso");

    private String _message;

    Messages(String message){
        _message = message;
    }

    public String getMessageText(){
        return _message;
    }
}
