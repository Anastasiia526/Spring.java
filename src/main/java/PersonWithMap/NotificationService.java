package PersonWithMap;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotificationService {
    private Map<String, Person> subscribers;

public void printNotification(){
    for(Map.Entry<String, Person> entry : subscribers.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
}
