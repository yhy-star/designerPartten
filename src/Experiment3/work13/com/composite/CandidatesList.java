package Experiment3.work13.com.composite;

import java.util.ArrayList;

/**
 * @ClassName： CandidatesList
 * @Description：候考人列表
 * @Author: yhy
 * @Date： 2021/12/28 22:14
 **/
public class CandidatesList extends Component{

    private String name;
    private ArrayList<Component> candidates = new ArrayList<>();

    public CandidatesList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Component> getCandidates() {
        return candidates;
    }

    public void setCandidates(ArrayList<Component> candidates) {
        this.candidates = candidates;
    }

    @Override
    public void addGroup(Component component) {
        candidates.add(component);
    }

    @Override
    public void remove(Component component) {
        if(!candidates.contains(component)){
            candidates.remove(component);
        }
    }

    @Override
    public void Onmessage(Component component) {
        if(component instanceof Examinee){
            component.Onmessage(component);
        } else {
            ArrayList<Component> components = ((CandidatesList) component).getCandidates();
            for (Component obj : components){
                obj.Onmessage(obj);
            }
        }
    }

}
