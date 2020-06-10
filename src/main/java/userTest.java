import com.itranswarp.util.HashUtil;

public class userTest {
    public static void main(String[] arg) {
        String email = "sponsor@mmtopic.com";
        String pwd = "123456";
        String adminSalt = "e43c4c3d60e8838383a902839fda9b5cd6beb90f0aa7660b171f39d838a2dfe5";
        String temp = HashUtil.hmacSha256(pwd, email);
        String password = HashUtil.hmacSha256(temp, adminSalt);
        System.out.println(password);
    }
}
