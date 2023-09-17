import com.db.proj1.*
import com.db.*

def call(message) {
    IFly flyObj = new Duck()
    echo "${flyObj.fly()}"
}
