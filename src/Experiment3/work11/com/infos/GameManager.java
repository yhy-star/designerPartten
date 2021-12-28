package Experiment3.work11.com.infos;

/**
 * @ClassName： GameManager
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 19:54
 **/
public class GameManager {

    private Scene scene = new Scene();
    private Role role = new Role();
    private SoundEffect soundEffect = new SoundEffect();

    private GameManager(){
    }

    public static enum GameManagerEnum{
        GAMEMANAGER;
        private GameManager instance = null;
        private GameManagerEnum(){
            instance = new GameManager();
        }
        public GameManager getInstance(){
            return instance;
        }
    }

    public void modify(){
        scene.modify();
        role.modify();
        soundEffect.modify();
    }
}
