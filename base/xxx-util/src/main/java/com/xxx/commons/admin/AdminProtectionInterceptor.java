//package com.xxx.commons.admin;
//
//import java.lang.annotation.Annotation;
//
//import com.xxx.bean.Hr;
//import com.xxx.service.ActiveHolder;
//import net.paoding.rose.web.ControllerInterceptorAdapter;
//import net.paoding.rose.web.Invocation;
//
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
////import com.xiaonei.platform.core.opt.OpiConstants;
////import com.xiaonei.platform.core.opt.adminPermission.AdminManager;
//
///**
// *
// */
//public class AdminProtectionInterceptor extends ControllerInterceptorAdapter {
//
//    @Autowired
//    private ActiveHolder hostHolder;
//
//    public AdminProtectionInterceptor() {
//        setPriority(LoginRequired.LOGIN_REQUIRED_PRIV - 1);
//    }
//
//    @Override
//    protected Class<? extends Annotation> getRequiredAnnotationClass() {
//        return AdminProtection.class;
//    }
//
//    private AdminProtection getProtection(Invocation inv) {
//        AdminProtection protection = inv.getMethod().getAnnotation(AdminProtection.class);
//        if (protection == null) {
//            protection = inv.getControllerClass().getAnnotation(AdminProtection.class);
//        }
//        return protection;
//    }
//
//    @Override
//    public Object before(Invocation inv) throws Exception {
//        Hr host = hostHolder.getUser();
//
////        if (host.getAuth() < User.authAdmin) {
////            inv.addFlash("msg", "您无权进行此操作");
////            return "r:" + OpiConstants.urlAdmin + "/loginAdmin.do";
////        }
//        //
//        AdminProtection protection = getProtection(inv);
//
//        String[] terms = StringUtils.split(protection.id(), "/");
//        if (terms.length != 2) {
//            throw new IllegalArgumentException(AdminProtection.class.getSimpleName() + ".id");
//        }
//        int functionId = Integer.parseInt(terms[0]);
//        int right = Integer.parseInt(terms[1]);
////        if (functionId != 0
////                && !AdminManager.getInstance().hasRight(host.getId(), functionId, right)) {
////            inv.addFlash("error", "您无权进行此操作");
////            return "r:" + OpiConstants.urlAdmin + "/admin/adminmanage.do";
////        }
////        //
////        if (!LoginAdminLogic.isCookieRight(host.getId())) {
////            inv.addFlash("msg", "请先登录管理员");
////            return "r:" + OpiConstants.urlAdmin + "/loginAdmin.do";
////        }
//        LoginAdminLogic.resetCookie(inv.getResponse(), host.getUid());
//        return true;
//    }
//
//}
