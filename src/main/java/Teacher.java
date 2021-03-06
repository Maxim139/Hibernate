import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Teacher extends Person {

    @ManyToMany(mappedBy = "teachers", cascade = CascadeType.ALL)
    private Set<Group> groups = new HashSet<>();

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "groups=" + groups +
                '}';
    }




}
