package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 11:41:13 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Criteria {
    Criteria criteria;
     boolean  evaluate(Application app){
        if(criteria==null)
            return true;
        else return criteria.evaluate(app);
    }
    public Criteria(Criteria criteria){
        this.criteria=criteria;
    }
}
