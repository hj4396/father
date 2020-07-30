import java.util.List;

/**
 * @author huj
 * @create 2020-07-30 16:56
 */
public interface IAccountdao {

    public List<Account> findAll();
    public void saveAccount(Account account);
}
