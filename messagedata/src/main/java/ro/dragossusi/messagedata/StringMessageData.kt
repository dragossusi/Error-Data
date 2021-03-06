package ro.dragossusi.messagedata

import ro.dragossusi.messagedata.parser.MessageDataParser
import java.io.Serializable

/**
 *
 * @author Dragos
 * @since 25.03.2020
 */
data class StringMessageData(val message: String) : MessageData, Serializable {

    override fun getMessage(parser: MessageDataParser): String {
        return message
    }

}
