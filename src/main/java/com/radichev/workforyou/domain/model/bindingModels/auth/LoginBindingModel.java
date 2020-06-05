package com.radichev.workforyou.domain.model.bindingModels.auth;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginBindingModel {
    @NotNull
    @Size(min = 4, max = 30)
    private String username;

    @NotNull
    @Length(min = 6, max = 30)
    private String password;

    public LoginBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
