object q_8_1{
    
    def encrypt(text: String , shifter: Int): String = {
        text.map(c => (c + shifter).toChar)
    }

    def decrypt(text: String , shifter: Int): String = {
        text.map(c => (c - shifter).toChar)
    }

    def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
        algo(text, shift)
    }

    def main(args: Array[String]): Unit = {
        val originaltext = "Hi, Pawan!"
        val shift = 1

        // Encrypt the originaltext
        val encryptedText = cipher(originaltext, shift, encrypt)
        println(s"Encrypted Text: $encryptedText")

        // Decrypt the ciphertext
        val decryptedText = cipher(encryptedText, shift, decrypt)
        println(s"Decrypted Text: $decryptedText")
    }
}
