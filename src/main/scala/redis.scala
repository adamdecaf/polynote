package org.decaf.polynote
import redis.clients.jedis._

trait RedisConfig {
  def host: String
  def port: Int
  def timeout: Int
}

class RedisPool(config: RedisConfig) {
  private[this] lazy val pool = new JedisPool(new JedisPoolConfig(), config.host, config.port, config.timeout)

  def withJedisClient[T](f: Jedis => T): T = {
    val jedis: Jedis = pool.getResource

    try {
      f(jedis)
    } finally {
      pool.returnResourceObject(jedis)
    }
  }
}
