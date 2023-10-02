package com.mv.chatappmobile.network.websocket

import android.util.Log
import com.mv.chatappmobile.data.ChatMessage
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener

class ChatWebSocketListener : WebSocketListener() {

    override fun onOpen(webSocket: WebSocket, response: Response) {
        // Handle WebSocket connection opened
        Log.i("socket onOpen", "connection opened")
    }

    override fun onMessage(webSocket: WebSocket, text: String) {
        try {
            Log.d("socket onMessage", text)
        } catch (e: Exception) {
            // Handle JSON parsing error
            Log.e("socket onMessage", e.message.toString())
        }
    }

    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
        // Handle WebSocket connection failure
        Log.e("socket onFailure", t.message.toString())
    }

    override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
        // Handle WebSocket connection closed
        Log.i("socket onClosed", code.toString())
    }
}