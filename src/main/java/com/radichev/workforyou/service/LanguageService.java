package com.radichev.workforyou.service;

import com.radichev.workforyou.model.bindingModels.languageBindingModel.LanguageBindingModel;

public interface LanguageService {

    void addLanguage(LanguageBindingModel languageBindingModel, String userId);

}
