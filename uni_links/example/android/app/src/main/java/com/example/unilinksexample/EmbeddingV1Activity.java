package com.example.unilinksexample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.flutter.app.FlutterActivity;

public class EmbeddingV1Activity extends FlutterActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // V1 embedding is no longer supported with AGP 8
        // The plugin will be automatically registered via V2 embedding
    }
}
