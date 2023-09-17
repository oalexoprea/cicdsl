import com.db.proj1.Duck
import com.db.IFly

def call(message) {
    IFly flyObj = new Duck()
    echo "${flyObj.fly()}"
}
