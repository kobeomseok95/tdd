package tdd.exampleOne;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeManagerTest {

    @Test
    public void 메세지1_테스트(){
        /**
         * GradeManager에 Message들이 Enum일것
         * 함수가 static
         * prize가 null일 경우
         * prize는 빈문자가 아닌지 맞는지 판별
         */
        //사원
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 0, ""));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 0, null));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 0, "some prize"));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 499, ""));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 499, null));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("사원", 499, "some prize"));
        //관리자
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2000, ""));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2000, null));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2000, "some prize"));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2499, ""));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2499, null));
        assertEquals(GradeManager.MESSAGE_1, GradeManager.getGradeMessage("관리자", 2499, "some prize"));
    }

    @Test
    public void 메세지2_테스트(){
        //사원
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("사원", 500, ""));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("사원", 500, "some prize"));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("사원", 999, ""));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("사원", 999, "some prize"));
        //관리자
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("관리자", 2500, ""));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("관리자", 2500, "some prize"));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("관리자", 2999, ""));
        assertEquals(GradeManager.MESSAGE_2, GradeManager.getGradeMessage("관리자", 2999, "some prize"));
    }

    @Test
    public void 메세지3_테스트(){
        //사원
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("사원", 1000, ""));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("사원", 1000, "some prize"));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("사원", 1499, ""));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("사원", 1499, "some prize"));
        //관리자
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("관리자", 3000, ""));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("관리자", 3000, "some prize"));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("관리자", 3499, ""));
        assertEquals(GradeManager.MESSAGE_3, GradeManager.getGradeMessage("관리자", 3499, "some prize"));
    }
}
