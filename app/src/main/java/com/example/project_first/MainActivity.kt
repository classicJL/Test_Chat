import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import your.package.name.R



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 보내기 버튼 클릭 이벤트 처리
        val sendButton: Button = findViewById(R.id.sendButton)
        sendButton.setOnClickListener {
            sendMessage()
        }
    }

    // 메시지 전송 함수
    private fun sendMessage() {
        // 채팅 입력창에서 메시지 가져오기
        val chatEditText: EditText = findViewById(R.id.chatEditText)
        val message = chatEditText.text.toString().trim()

        // 가져온 메시지를 채팅 목록에 추가
        if (message.isNotEmpty()) {
            val chatLinearLayout: LinearLayout = findViewById(R.id.chatLinearLayout)
            val newMessageTextView = TextView(this)
            newMessageTextView.text = message
            chatLinearLayout.addView(newMessageTextView)

            // 전송 후 입력창 비우기
            chatEditText.text.clear()
        }
    }
}
