package ProxyPatterns.Patterns.test;

import ProxyPatterns.Patterns.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    @Test
    @DisplayName("Real test")
    void test1(){
        // 일단 기본 로직을 지키면서 대상 객체 앞단의 인터페이스 역활을 하는 것 일텐데?
        ProxyFactory proxy = new ProxyFactory();
        Subject subject = proxy.getObject();
        subject.action1();
        RealSubject real = new RealSubject();
        real.action2();

        assertEquals("RealSubject: action2", real.action2());

    }

    @Test
    @DisplayName("프록시 객체 테스트")
    void action() {
        ProxyFactory proxyFactory = new ProxyFactory();
        Subject subject = proxyFactory.getObject();
        subject.action1();
        subject.action2();
    }
    //해당 subject 객체는 실제 비지니스 로직이 아닌 추상화된 공통 로직
    // 이를 이용한 기능으로 aop가 있음.

    @Test
    @DisplayName("프록시 레이지로딩 테스트 (ACTION1 권한)")
    void actionLazyLoadingPermit1() {
        Proxy proxy = new Proxy(Permit.ACTION1);
        assertEquals("프록시로 action1 메서드 대체", proxy.action1());
        assertEquals("action2 의 실행 권한이 없습니다.", proxy.action2());
    }

    @Test
    @DisplayName("프록시 레이지로딩 테스트 (ACTION2 권한)")
    void actionLazyLoadingPermit2() {
        Proxy proxy = new Proxy(Permit.ACTION2);
        assertEquals("프록시로 action1 메서드 대체", proxy.action1());
        assertEquals("RealSubject: action2", proxy.action2());
    }
//action 2 의 권한을 가진 proxy 객체 생성
    @Test
    @DisplayName("프록시의 action1 카운트 수 구하기")
    void actionProxyCount() {
        Proxy proxy = new Proxy(Permit.ACTION1);
        proxy.action1();
        proxy.action1();
        proxy.action1();
        proxy.action1();
        assertEquals(4, proxy.getAction1Count());
    }
}
